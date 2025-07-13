package com.example.codequest;

@WebServlet("/AIQuiz")
public class AIQuizServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    BufferedReader reader = req.getReader();
    String json = reader.lines().collect(Collectors.joining());
    JSONObject input = new JSONObject(json);
    String topic = input.getString("topic");

    String payload = new JSONObject()
      .put("model", "gpt-3.5-turbo")
      .put("messages", new JSONArray()
        .put(new JSONObject().put("role", "user")
          .put("content", "Generate 3 MCQs with options and correct answers on topic: " + topic)))
      .toString();

    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("https://api.openai.com/v1/chat/completions"))
      .header("Authorization", "Bearer YOUR_API_KEY")
      .header("Content-Type", "application/json")
      .POST(HttpRequest.BodyPublishers.ofString(payload))
      .build();

    HttpClient client = HttpClient.newHttpClient();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    JSONObject aiResponse = new JSONObject(response.body());
    String content = aiResponse.getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content");

    JSONObject result = new JSONObject();
    result.put("questions", parseQuiz(content));
    resp.setContentType("application/json");
    resp.getWriter().write(result.toString());
  }

  private JSONArray parseQuiz(String content) {
    JSONArray arr = new JSONArray();
    // Simplified parsing - expect content in predictable format
    // Ideally parse lines to build question, options, answer
    return arr;
  }
}


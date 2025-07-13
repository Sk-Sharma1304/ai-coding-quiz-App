package com.example.codequest;

@WebServlet("/DailyChallenge")
public class DailyChallengeServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String challenge = "Write a Java program to reverse a linked list.";
    JSONObject obj = new JSONObject();
    obj.put("challenge", challenge);
    resp.setContentType("application/json");
    resp.getWriter().write(obj.toString());
  }
}

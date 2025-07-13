async function generateQuiz() {
  const topic = document.getElementById('topicInput').value;
  const response = await fetch('/AIQuiz', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ topic })
  });
  const quiz = await response.json();
  const container = document.getElementById('quizContainer');
  container.innerHTML = quiz.questions.map((q, i) => `
    <div>
      <p>${i + 1}. ${q.question}</p>
      ${q.options.map((opt, j) => `<label><input type="radio" name="q${i}" value="${opt}">${opt}</label><br>`).join('')}
    </div>
  `).join('');
}
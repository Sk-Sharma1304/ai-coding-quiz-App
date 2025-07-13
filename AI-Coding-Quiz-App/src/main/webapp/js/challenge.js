fetch('/DailyChallenge')
  .then(res => res.json())
  .then(data => {
    document.getElementById('challengeContainer').innerText = data.challenge;
  });
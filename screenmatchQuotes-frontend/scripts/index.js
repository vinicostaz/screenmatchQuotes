import getData from "./getData.js";

const btnShowMore = document.querySelector('.btn-show-more');
const quoteDescription = document.getElementById('quote-description');

function loadSeriesInfo() {
  getData(`/series/quotes`)
      .then(data => {
        quoteDescription.innerHTML = `
              <img src="${data.poster}" alt="${data.title}" />
              <div>
                  <h2>${data.title}</h2>
                  <div class="description-text">
                      <p><i>"${data.quote}"</i></p>
                      <p><b>Quoted by:</b> ${data.character}</p>
                  </div>
              </div>
          `;
      })
      .catch(error => {
          console.error('Error getting the info from the series:', error);
      });
}

window.onload = loadSeriesInfo();
btnShowMore.addEventListener('click', loadSeriesInfo);

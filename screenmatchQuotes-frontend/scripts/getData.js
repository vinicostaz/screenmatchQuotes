const baseURL = 'http://localhost:8080';

export default function getData(endpoint) {
    return fetch(`${baseURL}${endpoint}`)
        .then(response => response.json())
        .catch(error => {
            console.error('Error accessing the endpoint /series/quotes:', error);
        });
}

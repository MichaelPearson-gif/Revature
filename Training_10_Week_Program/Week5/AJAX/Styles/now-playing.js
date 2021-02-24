function getJokesAsynchronously(){

    // This is the endpoint we're using to access the resource we want to grab async
    let url = 'http://api.icndb.com/jokes/random/10';

    // If we want to use AJAX, we'll need to use an XMLHttpRequest.
    let xhr = new XMLHttpRequest(); // ready state is 0

    // I know that I want my jokes to be placed in the table's body, so I'll select the table's body right now.
    // This is just simple DOM manipulation
    let tbody = document.getElementById('jokesHere');

    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
            let jokes = JSON.parse(xhr.responseText)

            for(let j of jokes["value"]){
                // Let's create the new elements which whould be appended to the table.
                let tr = document.createElement('tr');
                let id = document.createElement('td');
                let content = document.createElement('td');
                let category = document.createElement('td');

                // Lets fill out our td elements with the data which belongs inside of them.
                id.innerHTML = j["id"];
                content.innerHTML = j["joke"];
                category.innerHTML = j.categories[0];

                // Now let's piece all of our elements together:
                tr.append(id);
                tr.append(content);
                tr.append(category);

                tbody.append(tr);
            }
        }
    }

    xhr.open('GET', url); // ready state is 1
    xhr.send() // ready state is 2

}

// Let's call our async function when the window loads
window.onload = function(){
    getJokesAsynchronously();
}
function grabAllCards(){
    // We want to select the div which contains all of the cards and append more cards to this div
    let div = document.querySelector('.card-details')

    // I want to place cards inside of this div. But I need to get the cards first.
    // I have already set up an endpoint which I can use to access information about monster cards,
    // so I can use this endpoint to grab my monster cards. We'll need AJAX to accomplish this task.

    // Let's start by creating an XMLHttpRequest object:

    let xhr = new XMLHttpRequest() // readystate 0

    /*
    We need to define what we want to do when the readyState is 4 (meaning that the response body has been
        populated on the server side); in our case, we want to put some cards on the page for the user to see.
        Wee can use the onreadystatechange event listener to listen for changes to our readystate.
        In essence, this listener is invoked each time the readystate changes
    */

    xhr.onreadystatechange = function(){
        // You decide what to do each time the readyState changes in this function!
        // Be sure to check that the readyState is 4 and that the response code is 200
        // (meaning that everything went smoothly)

        if(xhr.readyState === 4 & xhr.status === 200){
            // JSON.parse is a convenience function for parsing JSON as a JavaScript object
            let cards = JSON.parse(xhr.response)

            // We will add all our new cards as divs, so let's create a new dive for each
            for(let c of cards){
                let newCard = document.createElement('div')
                let cardId = document.createElement('p')
                let cardName = document.createElement('p')

                // Now let's fill out our card details
                cardId.innerText = c.cardId 
                cardName.innerText = c.cardName

                // Now that we've filled out the inner contents of our card data, we can append those elements to our "newCard" div
                newCard.append(cardId)
                newCard.append(cardName)

                div.append(newCard)
            }
        }
    }

    // Open my XMLHttpRequest, specifying my HTTP verb and the endpoint I would like to hit.
    xhr.open('GET', 'http://localhost:8080/ServletDemo/hello') // readystate 1
    xhr.send() // readystate 2
}

// Because we want these cards to appear as soon as the web page loads, we can take advantage of the window's onload event listener
// which fires immediately after the browser loads the window
window.onload = () => {
    grabAllCards()
}
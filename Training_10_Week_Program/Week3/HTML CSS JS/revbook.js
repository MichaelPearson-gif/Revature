let originalColors = true;

function changeColor(){
    // First we need to select the web elements that we wish to manipulate
    let h1 = document.getElementsByTagName('h1');
    let h2 = document.getElementsByTagName('h2');

    // Now let's manipulate the elements we'd like to change. In our case, we wish to change the color of our h1 and h2 text.

    if(this.originalColors){
        h1[0].style.color = 'orange';
        h2[0].style.color = 'white';
    }else{
        h1[0].style.color = 'white';
        h2[0].style.color = 'orange';
    }

    // Change the originalColors state to reflect that this function has been called and the text color has been changed
    this.originalColors = !this.originalColors;
}

// Currently, this function doesn't listen for any events. Thus, we can't use it to dynamically modify the colors our text. In order to do so,
// we'll have to use what we refer to as an "event listener". Event listeners "listen" for certain events on certain elements. Note that we add event
// listeners by associating JavaScript Events (Event is actually a JS object) with a callback function. A callback function is a function that is passed
// to anoher function as an argument and later invoked within that function

// Let's select the element we would like to add an event listener to. We will add our listener to the containing div for the h1 and h2
// (e.g. the div with id 'message')

let messageDiv = document.getElementById('message');

// Now let's add an event listener to this element
messageDiv.addEventListener('click', changeColor);

// We can also (and should) use JavaScript for tasks that are not purely cosmetic. We can also use it to perform client-side validation.
// Note that client-side validation is NOT enough to validate user information, so it should never be used alone; do NOT skip server-side 
// validation. That said, let's try our hand at writing a function which validates the length of a user password.

function validatePassword(){
    // We need to grab the element whose value we're trying to validate

    let inputBoxes = document.getElementsByTagName('input');
    // To isolate the user input in this input box, we can use the "value" property
    let userPass = inputBoxes[1].value

    if(userPass.length < 8){
        // We should tell the user why the form is not being submitted.

        // Let's first selcet the form on our web page

        let form = document.getElementById('form');

        // Let's create the error message we wish to append to it

        let errorMessage = document.createElement('p');

        // Specify the text for the new paragraph as it is currently empty
        errorMessage.innerText = 'Password must be at least 8 characters long!';

        // Now that we're specified the text content of our paragraph, let's append it to the form!
        form.append(errorMessage);
    }
}

// Let's create an event listener for the form's button
let button = document.queryCommandSelector('button');
button.addEventListener('click', validatePassword);
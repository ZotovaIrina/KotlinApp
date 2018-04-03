import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Sum calculation ";
    val root = document.getElementById("root");
    val div = document.createElement("div");
    val button = document.createElement("button");
    val h1 = document.createElement("h1");
    val span = document.createElement("span");

    var a = 1
    var b = 2
    var buttonIsClicked = false

    h1.textContent = message
    button.textContent = "Sum";
    button.addEventListener("click", {
        val text = "Sum is " + sum(a, b)
        if (buttonIsClicked) {
            a +=1
            b +=1
            span.textContent = "${text.replace("is", "was")}, but now is " + sum(a, b)
        } else {
            span.textContent = text
        }
        buttonIsClicked = true

    })

    div.appendChild(h1);
    div.appendChild(button);
    div.appendChild(span);

    //Display customer messages
    val customerContainer = document.createElement("div")
    div.appendChild(customerContainer)
    val customer = Customer("Irina", "irina@gmail.com", listOf("message 1", "message 2", "message 3"))
    val userName = document.createElement("span")
    userName.textContent = customer.name
    customerContainer.appendChild(userName)

    for (customerMessage in customer.messages) {
        val string = document.createElement("span")
        string.textContent = customerMessage
        customerContainer.appendChild(string)
    }

    // !! means if root is null don't do this
    root!!.appendChild(div);
}

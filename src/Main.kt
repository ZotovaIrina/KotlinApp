import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Hello World!!!";
    val root = document.getElementById("root");
    val div = document.createElement("div");
    val button = document.createElement("button");
    val h1 = document.createElement("h1");

    h1.textContent = message
    button.textContent = "Click";
    button.addEventListener("click", {
        println("Click");
    })

    div.appendChild(h1);
    div.appendChild(button);
    // !! means if root is null don't do this
    root!!.appendChild(div);
}

import kotlin.browser.document

import sum

fun main(args: Array<String>) {
    val message = "Sum calculation ";
    val root = document.getElementById("root");
    val div = document.createElement("div");
    val button = document.createElement("button");
    val h1 = document.createElement("h1");
    val span = document.createElement("span");

    h1.textContent = message
    button.textContent = "Sum";
    button.addEventListener("click", {
        span.textContent = "Sum is " + sum(1, 2)
    })

    div.appendChild(h1);
    div.appendChild(button);
    div.appendChild(span);
    // !! means if root is null don't do this
    root!!.appendChild(div);
}

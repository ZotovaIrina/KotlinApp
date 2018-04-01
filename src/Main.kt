import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Hello World!!!";
    val template = """
        <h1 class="header">$message</h1>
        <button id="button">Click</button>
        """
    println(message);
    val root = document.getElementById("root");
    // !! means if root is null don't do this
    root!!.innerHTML = template;
    val buttonClick = document.getElementById("button");
    buttonClick!!.addEventListener("click", {
        println("Clicked");
    })
}

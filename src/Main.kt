import kotlin.browser.document

fun main(args: Array<String>) {
    val message = "Hello World!!!";
    val template = """
        <h1 class="header">$message</h1>
        """
    println(message);
    val root = document.getElementById("root");
    // !! means if root is null don't do this
    root!!.innerHTML = template;
}

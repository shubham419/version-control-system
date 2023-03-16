import java.util.Collections.max

val lambda: (Int, Int) -> Int = result@{ a, b ->
    if (a > b)
        return@result a
    b
}
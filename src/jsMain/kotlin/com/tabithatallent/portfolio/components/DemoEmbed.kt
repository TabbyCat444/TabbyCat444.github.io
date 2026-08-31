package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.border
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.overflow
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Iframe

@Composable
fun CodeSandboxEmbed(
    embedUrl: String = "https://stackblitz.com/edit/kidnapped-by-the-fae?embed=1&file=main.py&hideExplorer=1&hideNavigation=1&view=preview",
    title: String = "Python Console Demo"
) {
    Div(
        attrs = {
            style {
                width(100.percent)
                height(450.px)
                borderRadius(8.px)
                overflow("hidden")
                border(1.px, LineStyle.Solid, Color("#334155")) // Matches Slate 700 border token
            }
        }
    ) {
        Iframe(
            attrs = {
                attr("src", embedUrl)
                attr("title", title)
                attr("sandbox", "allow-forms allow-modals allow-popups allow-presentation allow-same-origin allow-scripts")
                attr("allow", "accelerometer; ambient-light-sensor; camera; encrypted-media; geolocation; gyroscope; hid; microphone; midi; payment; usb; vr; xr-spatial-tracking")
                style {
                    width(100.percent)
                    height(100.percent)
                    border(0.px)
                }
            }
        )
    }
}
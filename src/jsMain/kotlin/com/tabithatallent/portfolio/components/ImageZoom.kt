package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun ZoomableImage(
    imageUrl: String,
    imageAlt: String
) {
    var zoomed by remember { mutableStateOf(false) }

    // ── Clicked image — show centered modal ──────────────────────────
    if (zoomed) {
        Div(attrs = {
            classes("modal-backdrop")
            attr("role", "dialog")
            attr("aria-modal", "true")
            attr("aria-label", "Image preview")
            onClick { zoomed = false }
        }) {
            Div(attrs = {
                classes("modal-overlay")
                attr("role", "document")
                onClick { event -> event.stopPropagation() }
            }) {
                Button(
                    attrs = {
                        classes("modal-close-btn")
                        attr("aria-label", "Close image preview")
                        onClick { zoomed = false }
                    }
                ) {
                    Text("✕")
                }

                Div(attrs = { classes("modal-content") }) {
                    Img(
                        src = imageUrl,
                        alt = imageAlt,
                        attrs = {
                            classes("zoomed-image")
                        }
                    )
                }
            }
        }
    }

    // ── Thumbnail — clickable to open zoom ───────────────────────────
    Img(
        src = imageUrl,
        alt = imageAlt,
        attrs = {
            onClick { zoomed = true }
        }
    )
}

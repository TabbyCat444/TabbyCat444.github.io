package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Form
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Label
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.TagElement
import org.w3c.dom.HTMLTextAreaElement

@Composable
fun ContactSection() {
    Div(attrs = { classes("hero-section") }) {

        // Left side — contact information
        Div(attrs = { classes("hero-left") }) {
            H1(attrs = { classes("hero-title") }) {
                Text("Get In Touch")
            }

            P {
                Text("I'm always open to new opportunities, collaborations, or just a friendly hello. " +
                        "Feel free to reach out through any of the channels below!")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Email: ")
            }
                Text("Tabithart@outlook.com")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Github: ")
            }
                Text("https://github.com/TabbyCat444")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("LinkedIn: ")
            }
                Text("https://linkedin.com/in/tabbycat444")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Location: ")
            }
                Text("Southwest Arkansas, United States")
            }

            P {
                Span(attrs = { classes("hero-tech-stack-category") }) {
                    Text("Currently Open to Freelance: ")
                }
                Text("Yes, contact me using the form on the right!")
            }
        }

        // Right side — contact form
        Div(attrs = { classes("hero-right") }) {
            H1(attrs = { classes("hero-title") }) {
                Text("Send Me a Message")
            }

            Form(
                action = "https://formsubmit.co/tabithart@outlook.com",
                attrs = {
                    attr("method", "POST")
                    classes("contact-form")
                }
            ) {

                Input(
                    type = InputType.Hidden,
                    attrs = {
                        attr("name", "_subject")
                        attr("value", "New Portfolio Contact Form Submission")
                    }
                )


                Input(
                    type = InputType.Hidden,
                    attrs = {
                        attr("name", "_captcha")
                        attr("value", "false")
                    }
                )


                Input(
                    type = InputType.Hidden,
                    attrs = {
                        attr("name", "_next")
                        attr("value", "TabbyCat444.github.io")
                    }
                )

                Input(type = InputType.Hidden, attrs = {
                    attr("name", "_type")
                    attr("value", "html")
                })

                Input(type = InputType.Hidden, attrs = {
                    attr("name", "_honeypot")
                    attr("style", "display:none")
                })


                // Name field
                Label(attrs = { classes("contact-form-label") }) {
                    Text("Name: ")
                }
                Input(
                    type = InputType.Text,
                    attrs = {
                        attr("name", "name")
                        attr("placeholder", " Your name")
                        attr("required", "required")
                        classes("contact-form-input")
                    }
                )
                Br()

                // Email field
                Label(attrs = { classes("contact-form-label") }) {
                    Text("Email: ")
                }
                Input(
                    type = InputType.Email,
                    attrs = {
                        attr("name", "email")
                        attr("placeholder", " your.email@example.com")
                        attr("required", "required")
                        classes("contact-form-input")
                    }
                )
                Br()

                // Message field
                Label(attrs = { classes("contact-form-label") }) {
                    Text("Message: ")
                }
                TagElement<HTMLTextAreaElement>(
                    tagName = "textarea",
                    applyAttrs = {
                        attr("name", "message")
                        attr("placeholder", " Write your message here...")
                        attr("required", "required")
                        classes("contact-form-textarea")
                        attr("rows", "5")
                    },
                    content = null
                )
                Br()

                // Submit button
                Div(attrs = { classes("button-spacer") }) {
                    Button(
                        attrs = {
                            attr("type", "submit")
                            classes("btn-primary", "contact-form-submit")
                        }
                    ) {
                        Text("Send Message")
                    }
                }
            }
        }
    }
}

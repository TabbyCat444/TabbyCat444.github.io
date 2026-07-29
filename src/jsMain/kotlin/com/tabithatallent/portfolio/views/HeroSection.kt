package com.tabithatallent.portfolio.views

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun heroSection() {
    Div(attrs = { classes("hero-section") }) {

        Div(attrs = { classes("hero-left") }) {
            H1(attrs = { classes("hero-title") }) {
                Text("Meet The Developer")
            }

            P() {
                Text("Hi, I'm Tabitha, a passionate software engineer with a love for creating innovative " +
                        "solutions. I’m a Summa Cum Laude Computer Science graduate with a passion for full-stack " +
                        "engineering, native Android, and multiplatform development using Kotlin, Java, C++, and more. " +
                        "Whether I’m untangling low-level system mechanics or crafting responsive interfaces with " +
                        "Kotlin/JS and Compose, I focus on writing performant, maintainable code that delivers real " +
                        "user value.")
            }
            P() {
                Text("Backed by years of real-world experience in high-tempo troubleshooting and " +
                        "customer-focused problem solving, I bridge technical precision with intuitive design—and when " +
                        "I'm away from full-stack projects, I'm usually diving into game mechanics in Godot or " +
                        "exploring new tools in the Kotlin ecosystem.")
            }
        }

        Div(attrs = { classes("hero-right") }) {
            H1(attrs = { classes("hero-title") }) {
                Text("My Tech Stack")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Programming/Markup Languages: ")
            }
                Text("Kotlin, Java, JavaScript, C#, C++, Python, HTML5, CSS, Tailwind CSS")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Frontend Frameworks & UI: ")
            }
                Text("Angular, Svelte, Material")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Backend & Runtimes: ")
            }
                Text("PHP (Laravel) Node.js")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Databases: ")
            }
                Text("MongoDB, SQLite, Postgres")
            }

            P{ Span(attrs = { classes("hero-tech-stack-category") }) {
                Text("Game Engines & Interactive: ")
            }
                Text("Godot")
            }

            P {
                Span(attrs = { classes("hero-tech-stack-category") }) {
                    Text("Cloud, DevOps, & Developer Tools: ")
                }
                Text("Git, Github, Docker, AWS")
            }
        }
    }
}
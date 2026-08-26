package com.tabithatallent.portfolio.views

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.components.ProjectCard
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@Composable
fun homeView() {
    heroSection()

    Div(attrs = { classes("projects-section-title") }) {
        H3 { Text("Featured Projects") }
    }

    Div(attrs = { classes("projects-section") }) {

        ProjectCard(
            projectName = "JapCrd",
            projectImage = "images/JapCrd-thumbnail.png",
            projectDescription = "JapCrd is a clean, focused Android flashcard application designed for mastering " +
                    "Japanese Hiragana. Built with modern Android practices, it provides an intuitive interface for " +
                    "deck-based practice, featuring flipping mechanics, navigation, and randomized study sessions."
        )

        ProjectCard(
            projectName = "The Corner Slice Bakery",
            projectImage = "images/cornerslicebakery-thumbnail.png",
            projectDescription = "The Corner Slice Bakery is a modern, responsive web site built with Webpack that" +
                    " showcases a full product catalog, catering options, and interactive UX features. Designed around" +
                    " a custom brand identity, it leverages modular HTML component architecture and dynamic asset " +
                    "bundling to deliver lightweight visual menu popups and a fast, seamless user experience."
        )
    }

    Div(attrs = { classes("projects-section-title") }) {
        H3 { Text("More Of My Work") }
    }

    Div(attrs = { classes("projects-section") }) {
        ProjectCard(
            projectName = "More Projects Coming Soon!",
            projectImage = "images/comingsoon-thumbnail.png",
            projectDescription = "More projects are coming soon! Stay tuned for updates!"
        )

        ProjectCard(
            projectName = "More Projects Coming Soon!",
            projectImage = "images/comingsoon-thumbnail.png",
            projectDescription = "More projects are coming soon! Stay tuned for updates!"
        )

        ProjectCard(
            projectName = "Druid Space Program - *WIP*",
            projectImage = "images/DruidSpaceProgram-Thumbnail.png",
            projectDescription = "Druid Space Program is an incremental space-builder where you play as an ancient " +
                    "High Archivist rebuilding a shattered galactic civilization. Shapeshift into forest animals to" +
                    " automate resource production—scaling from primitive wilderness tools to zero-gravity, " +
                    "space-faring industry. Collect Astral Amber to unlock lost memories, upgrade animal forms, and" +
                    " construct orbital infrastructure to reach a Type 2 civilization."
        )

        ProjectCard(
            projectName = "More Projects Coming Soon!",
            projectImage = "images/comingsoon-thumbnail.png",
            projectDescription = "More projects are coming soon! Stay tuned for updates!"
        )

    }
}
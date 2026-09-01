package com.tabithatallent.portfolio.views

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.components.ProjectCard
import com.tabithatallent.portfolio.components.ContactSection
import com.tabithatallent.portfolio.components.HeroSection
import com.tabithatallent.portfolio.nav.ProjectScreen
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text

@Composable
fun homeView(onProjectClick: (ProjectScreen) -> Unit) {
    Div(attrs = { id("about")}) {
        HeroSection()
    }

    Div(attrs = { id("projects")}) {
        Div(attrs = { classes("projects-section-title") }) {
            H3 { Text("Featured Projects") }
        }
    }

    Div(attrs = { classes("projects-section") }) {

        ProjectCard(
            projectName = "JapCrd",
            projectImage = "images/japCrd/JapCrd-thumbnail.png",
            projectDescription = "JapCrd is a clean, focused Android flashcard application designed for mastering " +
                    "Japanese Hiragana. Built with modern Android practices, it provides an intuitive interface for " +
                    "deck-based practice, featuring flipping mechanics, navigation, and randomized study sessions.",
            imageAlt = "JapCrd — Android flashcard app home screen showing deck selection menu"
        ) { onProjectClick(ProjectScreen.JapCrd) }

        ProjectCard(
            projectName = "The Corner Slice Bakery",
            projectImage = "images/cornerSliceBakery/cornerslicebakery-thumbnail.png",
            projectDescription = "The Corner Slice Bakery is a modern, responsive web site built with Webpack that" +
                    " showcases a full product catalog, catering options, and interactive UX features. Designed around" +
                    " a custom brand identity, it leverages modular HTML component architecture and dynamic asset " +
                    "bundling to deliver lightweight visual menu popups and a fast, seamless user experience.",
            imageAlt = "The Corner Slice Bakery — responsive bakery website home page with product catalog"
        ) { onProjectClick(ProjectScreen.CornerSliceBakery) }

    }

    Div(attrs = { classes("projects-section-title") }) {
        H3 { Text("More Of My Work") }
    }

    Div(attrs = { classes("projects-section") }) {
        ProjectCard(
            projectName = "Kidnapped by the Fae",
            projectImage = "images/kidnappedByTheFae/KidnappedByTheFae-Thumbnail.png",
            projectDescription = "Navigate a randomly generated fairy kingdom in this zero-dependency Python text" +
                    " adventure. Collect six mystical gifts, explore interconnected rooms, and reach the Fairy King" +
                    " before you're trapped forever. Built with a clean, modular architecture and built-in layout" +
                    " validation for replayable, educational gameplay.",
            imageAlt = "Kidnapped by the Fae — terminal text adventure game title screen"
        ) { onProjectClick(ProjectScreen.KidnappedByTheFae) }

        ProjectCard(
            projectName = "Tax Calculator",
            projectImage = "images/taxCalculator/TaxCalculator-Thumbnail.png",
            projectDescription = "More projects are coming soon! Stay tuned for updates!",
            imageAlt = "Tax Calculator — command-line tax calculation tool screenshot"
        ) { onProjectClick(ProjectScreen.TaxCalculator) }

        ProjectCard(
            projectName = "Druid Space Program - *WIP*",
            projectImage = "images/druidSpaceProgram/DruidSpaceProgram-Thumbnail.png",
            projectDescription = "Druid Space Program is an incremental space-builder where you play as an ancient " +
                    "High Archivist rebuilding a shattered galactic civilization. Shapeshift into forest animals to" +
                    " automate resource production—scaling from primitive wilderness tools to zero-gravity, " +
                    "space-faring industry. Collect Astral Amber to unlock lost memories, upgrade animal forms, and" +
                    " construct orbital infrastructure to reach a Type 2 civilization.",
            imageAlt = "Druid Space Program — incremental clicker game main screen with clicker and animal workers"
        ) { onProjectClick(ProjectScreen.DruidSpaceProgram) }

        ProjectCard(
            projectName = "Family Planner Hub - *Coming Soon*",
            projectImage = "images/ComingSoon-Dark.png",
            projectDescription = "More projects are coming soon! Stay tuned for updates!",
            imageAlt = "Coming soon — placeholder image for the Family Planner Hub project"
        )


    }

    Div(attrs = { id("contact")}) {
        Div(attrs = { classes("projects-section-title") }) {
            H3 { Text("Contact Me") }
        }
    }
    ContactSection()
}
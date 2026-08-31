package com.tabithatallent.portfolio.views.projects

import com.tabithatallent.portfolio.components.ZoomableImage
import com.tabithatallent.portfolio.components.ResourceItem
import com.tabithatallent.portfolio.components.FeaturesList
import com.tabithatallent.portfolio.components.TechChip
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Video

@Composable
fun japCard() {
    Div(attrs = { classes("japcrd") }) {

        // ── HERO ──────────────────────────────────────────────────────
        Div(attrs = { classes("project-hero") }) {
            Div(attrs = { classes("project-hero-content") }) {
                H1(attrs = { classes("project-view-title") }) {
                    Text("JapCrd")
                }
                P(attrs = { classes("project-hero-subtitle") }) {
                    Text("Japanese Hiragana Flashcard App")
                }
                A(
                    href = "https://github.com/tabbycat444/JapCrd",
                    attrs = { classes("project-hero-link") }
                ) {
                    Text("View on GitHub")
                }
            }
        }

        // ── OVERVIEW ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Overview")
        }
        P {
            Text(
                "JapCrd is a clean, focused Android flashcard application designed for mastering " +
                        "Japanese Hiragana. Built with modern Android practices, it provides an intuitive " +
                        "interface for deck-based practice, featuring flip mechanics, navigation, and " +
                        "randomized study sessions — all in a lightweight, offline package."
            )
        }

        // ── METADATA ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Metadata")
        }
        P {
            Text("Role: Lead Developer & UI Designer")
            Br()
            Text("Category: Educational Tool, Interactive Application")
            Br()
            Text("Repository: ")
            A(href = "https://github.com/tabbycat444/JapCrd", attrs = { classes("project-hero-link") })
            { Text("github.com/tabbycat444/JapCrd") }
        }

        // ── TECH STACK ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Tech Stack")
        }
        Div(attrs = { classes("tech-stack-grid") }) {
            TechChip("Language", "Kotlin")
            TechChip("UI Framework", "Jetpack Compose")
            TechChip("Design System", "Material 3")
            TechChip("Architecture", "MVVM (Model-View-ViewModel)")
            TechChip("Layout", "ConstraintLayout Compose")
            TechChip("Typography", "Google Fonts API (Alegreya + Noto Sans Japanese)")
            TechChip("Minimum SDK", "30 (Android 11)")
            TechChip("Target SDK", "36 (Android 14)")
        }

        // ── FEATURES ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Features")
        }
        FeaturesList(
            "Interactive Card Flip — tap to reveal romanization and pronunciation hints",
            "Deck Navigation — seamlessly move through cards with Prev and Next buttons",
            "Shuffle Mode — randomize the deck to break muscle memory during study",
            "Drawer Menu — switch between four distinct Hiragana categories",
            "Material 3 UI — modern, responsive design with custom typography",
            "Offline-First — no network required; all data is local"
        )

        // ── DECKS ─────────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Decks Included")
        }
        Div(attrs = { classes("decks-list") }) {
            ResourceItem("Basic Hiragana", "46 characters")
            ResourceItem("Voiced Hiragana — Dakuten", "25 characters")
            ResourceItem("Contracted Hiragana — Yōon", "36 characters")
            ResourceItem("All Hiragana — Comprehensive", "107 characters")
        }

        // ── CHALLENGE ─────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Challenge")
        }
        P {
            Text(
                "Mastering Japanese script and vocabulary requires consistent spaced repetition and " +
                        "rapid visual recognition. Existing market options often present two major downsides:"
            )
        }
        P {
            Text("1. Excessive Gamification & Distractions — unnecessary animations, ads, or complex " +
                    "menus slow down the actual practice flow.")
        }
        P {
            Text("2. Rigid Deck Structures — users lack simple, custom ways to focus on specific " +
                    "character subsets (e.g., specific Hiragana rows or custom vocabulary sets).")
        }

        // ── SOLUTION ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Solution & Architecture")
        }
        P {
            Text(
                "JapCrd was engineered to deliver a clean, zero-friction flashcard experience with " +
                        "an emphasis on performance and clean code separation."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("State Management & Unidirectional Data Flow")
        }
        P {
            Text(
                "By utilizing a state-driven architecture, the application decouples UI rendering " +
                        "from underlying learning logic. State updates — flipping a card, advancing to the " +
                        "next card, shuffling the deck — flow strictly through predictable events via " +
                        "mutableStateOf in the ViewModel."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Clean Data Modeling")
        }
        P {
            Text(
                "Data models separate card metadata from deck hierarchy, allowing seamless additions " +
                        "of new custom decks or expansion into full spaced-repetition system (SRS) algorithms " +
                        "in future releases. The CardRepository serves as a centralized data source."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Component Architecture")
        }
        P {
            Text(
                "The UI layer is split into reusable components (CardItem, OutlinedText, TitleText) " +
                        "and full-screen screens (FlashcardScreen). Theme definitions — colors, typography, " +
                        "and dark/light palettes — are fully isolated. Edge-to-edge display is enabled for " +
                        "a modern full-screen experience."
            )
        }

        // ── PROJECT STRUCTURE ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Project Structure")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """JapCrd/
├── app/
│   └── src/main/java/io/github/tabbycat444/japcrd/
│       ├── data/
│       │   ├── CardData.kt          # Data model
│       │   └── CardRepository.kt    # Deck data source
│       ├── ui/
│       │   ├── MainActivity.kt      # Entry point
│       │   ├── components/
│       │   │   ├── CardItem.kt      # Flashcard widget
│       │   │   ├── OutlinedText.kt  # Outline + fill text
│       │   │   └── TitleText.kt     # Title surface
│       │   ├── screens/
│       │   │   ├── FlashcardScreen.kt
│       │   │   └── FlashcardUiState.kt
│       │   └── theme/
│       │       ├── Color.kt         # M3 light/dark palettes
│       │       ├── Theme.kt         # Theme entry point
│       │       └── Type.kt          # Custom typography
│       └── viewmodel/
│           └── JapCrdViewModel.kt   # State management"""
            )
        }

        // ── KEY TAKEAWAYS ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Takeaways & Lessons Learned")
        }
        FeaturesList(
            "User-Centric UI — emphasized speed and responsiveness so learning loops remain tight and engaging",
            "Scalable Data Architecture — designed data parsing logic to easily support external CSV/JSON imports for custom user-created flashcard decks",
            "Compose Best Practices — learned to isolate UI state, separate components, and leverage Material 3 theming effectively"
        )

        // ── ROADMAP ───────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Roadmap")
        }
        FeaturesList(
            "Favorites system",
            "User-created custom decks",
            "Study progress tracking & statistics",
            "Quiz Mode with scoring",
            "Audio pronunciation playback",
            "Writing practice"
        )

        // ── SCREENSHOTS ───────────────────────────────────────────────
        // ── SCREENSHOTS ───────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Screenshots — Light Mode")
        }
        Div(attrs = { classes("project-image-set") }) {
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdMenuLight.png",
                imageAlt = "JapCrd — Light Mode Home Screen"
            )
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdFlashcardFrontLight.png",
                imageAlt = "JapCrd — Light Mode Flashcard Front"
            )
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdFlashcardBackLight.png",
                imageAlt = "JapCrd — Light Mode Flashcard Back"
            )
        }

        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Screenshots — Dark Mode")
        }
        Div(attrs = { classes("project-image-set") }) {
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdMenu.png",
                imageAlt = "JapCrd — Dark Mode Home Screen"
            )
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdFlashcardFront.png",
                imageAlt = "JapCrd — Dark Mode Flashcard Front"
            )
            ZoomableImage(
                imageUrl = "images/japCrd/JapCrdFlashcardBack.png",
                imageAlt = "JapCrd — Dark Mode Flashcard Back"
            )
        }

        // ── DEMO VIDEO ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Demo Video")
        }

        Div(attrs = { classes("demo-video-row") }) {
            Video(
                attrs = {
                    attr("src", "videos/japCrd/JapCrd-DarkVid.mp4")
                    attr("controls", "")
                    attr("playsinline", "")
                    classes("demo-video")
                }
            )
            Video(
                attrs = {
                    attr("src", "videos/japCrd/JapCrd-LightVid.mp4")
                    attr("controls", "")
                    attr("playsinline", "")
                    classes("demo-video")
                }
            )
        }
    }
}
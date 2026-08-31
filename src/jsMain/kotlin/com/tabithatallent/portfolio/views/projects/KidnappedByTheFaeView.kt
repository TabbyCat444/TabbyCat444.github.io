package com.tabithatallent.portfolio.views.projects

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.components.CodeSandboxEmbed
import com.tabithatallent.portfolio.components.ZoomableImage
import com.tabithatallent.portfolio.components.ResourceItem
import com.tabithatallent.portfolio.components.FeaturesList
import com.tabithatallent.portfolio.components.TechChip
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun kidnappedByTheFae() {
    Div(attrs = { classes("japcrd") }) {

        // ── HERO ──────────────────────────────────────────────────────
        Div(attrs = { classes("project-hero") }) {
            Div(attrs = { classes("project-hero-content") }) {
                H1(attrs = { classes("project-view-title") }) {
                    Text("Kidnapped By The Fae - *Terminal Game*")
                }
                P(attrs = { classes("project-hero-subtitle") }) {
                    Text("Text-Based Adventure Game — Python")
                }
                A(
                    href = "https://github.com/TabbyCat444/kidnapped_by_the_fae",
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
                "Kidnapped By The Fae is a simple text-based adventure game built entirely in Python 3 " +
                        "with zero external dependencies. The player awakens in a mushroom circle within the " +
                        "fairy kingdom and must explore randomized room layouts, collect six gifts, and reach " +
                        "the Fairy King to plead their case for return — or remain trapped forever. Each " +
                        "playthrough presents a different map, ensuring replayability."
            )
        }

        // ── METADATA ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Metadata")
        }
        P {
            Text("Role: Sole Developer & Designer")
            Br()
            Text("Category: Game, Text Adventure, Educational")
            Br()
            Text("Repository: ")
            A(href = "https://github.com/TabbyCat444/kidnapped_by_the_fae", attrs = { classes("project-hero-link") })
            { Text("github.com/TabbyCat444/kidnapped_by_the_fae") }
        }

        // ── TECH STACK ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Tech Stack")
        }
        Div(attrs = { classes("tech-stack-grid") }) {
            TechChip("Language", "Python 3")
            TechChip("Dependencies", "None (stdlib only)")
            TechChip("Architecture", "Modular — 4 files, single responsibility")
            TechChip("Data Model", "Dictionary-based room graph")
            TechChip("Randomization", "Random layout selection per session")
            TechChip("Validation", "BFS reachability check at import time")
            TechChip("Input Handling", "Normalized string parsing")
            TechChip("State Management", "Module-level inventory + room key")
        }

        // ── KEY FEATURES ──────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Features")
        }
        FeaturesList(
            "Randomized layouts — one of four distinct room maps is chosen each game, changing room connections and item locations",
            "Six collectible items — silver leaf, river pebble, small bone, exotic mushroom, pretty feather, opal",
            "Win/lose condition — reaching the Fairy King with all six gifts returns you home; fewer items means permanent exile",
            "No backtracking — collected items persist in inventory across the session",
            "BFS layout validation — every layout is checked at module import time to ensure all rooms are reachable from the start",
            "Normalized input parsing — extra whitespace and mixed case are handled transparently"
        )

        // ── COLLECTIBLE ITEMS ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Collectible Items")
        }
        Div(attrs = { classes("decks-list") }) {
            ResourceItem("Silver Leaf", "Found in Weird Silver Trees")
            ResourceItem("River Pebble", "Found in Forest River")
            ResourceItem("Small Bone", "Found in Animal Trail")
            ResourceItem("Exotic Mushroom", "Found in Small Clearing")
            ResourceItem("Pretty Feather", "Found in Bird Nest Shrubs")
            ResourceItem("Opal", "Found in Old Fallen Tree")
        }

        // ── THE CHALLENGE ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Challenge")
        }
        P {
            Text(
                "Building a text adventure that feels fresh on every playthrough requires more than just " +
                        "a single static map. The challenge was designing a data-driven room system where " +
                        "multiple complete layouts could be defined declaratively, randomly selected at runtime, " +
                        "and guaranteed to be fully connected — all while keeping the codebase simple enough for " +
                        "educational use."
            )
        }
        P {
            Text("1. Randomized Map Generation — four distinct layouts needed to share the same item set and room names while varying in connectivity, ensuring no dead-ends or unreachable items.")
        }
        P {
            Text("2. Validation at Import Time — every layout must be provably solvable. A BFS reachability check catches broken layouts before the game even starts, failing fast with a clear error message.")
        }
        P {
            Text("3. Input Normalization — player commands like \"  Go   North  \" or \"GO NORTH\" must resolve to the same action without brittle string matching.")
        }

        // ── THE SOLUTION & ARCHITECTURE ───────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Solution & Architecture")
        }
        P {
            Text(
                "A four-file modular design with strict separation of concerns: data (room definitions), " +
                        "logic (game loop), configuration (layout selection), and orchestration (entry point)."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Dictionary-Based Room Graph")
        }
        P {
            Text(
                "Each room is a dictionary with a 'Name' key, directional 'go <dir>' keys mapping to " +
                        "target room names, and an optional 'item' key. The `build_room_data()` function " +
                        "converts a flat list of room definitions into a lookup-friendly dict structure. " +
                        "This makes navigation a simple dictionary lookup — no graph traversal needed at runtime."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("BFS Reachability Validation")
        }
        P {
            Text(
                "The `validate_layout()` function performs a breadth-first search starting from " +
                        "'Mushroom Circle', collecting every reachable room. If any room is unreachable, " +
                        "a ValueError is raised at module import time. This catches layout bugs before " +
                        "the game runs and makes adding new layouts safe — the validation error tells you " +
                        "exactly which rooms are broken."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Modular File Responsibilities")
        }
        P {
            Text(
                "`main.py` orchestrates the game by calling story(), instructions(), and game_play() " +
                        "in sequence. `game_config.py` handles layout selection via random.choice(). " +
                        "`fae_dicts.py` defines all room data and validation logic. `fae_funcs.py` contains " +
                        "the narrative, input parsing, inventory tracking, and the main game loop. Each file " +
                        "has a single responsibility, making the project easy to extend and understand."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Input Normalization")
        }
        P {
            Text(
                "Player input is passed through `' '.join(player_move.lower().split())` to normalize " +
                        "whitespace and case. This turns messy input like \"  Go   NORTH  \" into \"go north\", " +
                        "matching the expected command format without complex regex or parsing logic."
            )
        }

        // ── PROJECT STRUCTURE ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Project Structure")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """KidnappedByTheFae/
├── main.py            # Entry point — orchestrates story, instructions, game loop
├── game_config.py     # Layout selection — random.choice from LAYOUT_OPTIONS
├── fae_dicts.py       # Room definitions — 4 layouts, build_room_data(), validate_layout()
├── fae_funcs.py       # Game logic — story text, instructions, inventory, main loop
└── README.md          # Documentation, play instructions, tech stack"""
            )
        }

        // ── ROOM MAPS ─────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Room Layouts")
        }
        Div(attrs = { classes("decks-list") }) {
            ResourceItem("Layout 1", "8 rooms — linear path to Fairy King")
            ResourceItem("Layout 2", "8 rooms — Fairy King adjacent to start, silver leaf far end")
            ResourceItem("Layout 3", "8 rooms — Animal Trail shortcuts to Fairy King")
            ResourceItem("Layout 4", "8 rooms — Forest River connects directly to Fairy King")
        }

        // ── KEY TAKEAWAYS ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Takeaways & Lessons Learned")
        }
        FeaturesList(
            "Data-driven design — defining rooms as dictionaries instead of hardcoding navigation made it trivial to create four unique layouts",
            "Validation as a first-class concern — BFS checks at import time catch errors before runtime, a pattern applicable far beyond game development",
            "Input normalization simplicity — a one-liner for whitespace/case normalization eliminated a whole class of edge-case bugs",
            "Modular separation — keeping data, logic, config, and orchestration in separate files made the project easy to reason about and extend",
            "Educational value — zero dependencies and ~150 lines of clean Python make this a great teaching example for beginners"
        )

        // ── ROADMAP ───────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Roadmap")
        }
        FeaturesList(
            "More room layouts — expand from 4 to 8+ randomized maps",
            "Interactive story text — contextual descriptions per room beyond just item presence",
            "Item descriptions — flavor text when collecting each gift",
            "Save/Load — persist inventory and room state between sessions",
            "Hint system — nudge players toward uncollected items",
            "Multiple endings — branching narrative based on which gifts were collected"
        )

        // ── SCREENSHOTS ───────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Screenshots")
        }
        Div(attrs = { classes("project-image-set") }) {
            ZoomableImage(
                imageUrl = "images/kidnappedByTheFae/KidnappedByTheFae-Start.png",
                imageAlt = "Kidnapped By The Fae — Terminal Gameplay Start"
            )
            ZoomableImage(
                imageUrl = "images/kidnappedByTheFae/KidnappedByTheFae-Loss.png",
                imageAlt = "Kidnapped By The Fae — Terminal Gameplay Loss"
            )
            ZoomableImage(
                imageUrl = "images/kidnappedByTheFae/KidnappedByTheFae-Win.png",
                imageAlt = "Kidnapped By The Fae — Terminal Gameplay Win"
            )
        }

        // ── PLAY DEMO ────────────────────────────────────────────────
        /* H3(attrs = { classes("project-view-subtitle") }) {
            Text("Interactive Demo")
        }
        CodeSandboxEmbed(
            embedUrl = "https://stackblitz.com/edit/kidnapped-by-the-fae?embed=1&file=main.py&hideExplorer=1&hideNavigation=1&view=preview",
            title = "Kidnapped by the Fae Live Demo")*/

        // ── Footer ────────────────────────────────────────────────────
        Div(attrs = { classes("project-footer") }) {
            P { Text("Created by Tabitha Tallent") }
            P { Text("MIT License") }
        }
    }
}

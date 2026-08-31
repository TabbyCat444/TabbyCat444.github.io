package com.tabithatallent.portfolio.views.projects

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.components.ZoomableImage
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun druidSpaceProgram() {
    Div(attrs = { classes("japcrd") }) {

        // ── HERO ──────────────────────────────────────────────────────
        Div(attrs = { classes("project-hero") }) {
            Div(attrs = { classes("project-hero-content") }) {
                H1(attrs = { classes("project-view-title") }) {
                    Text("Druid Space Program *Work in Progress*")
                }
                P(attrs = { classes("project-hero-subtitle") }) {
                    Text("Incremental Clicker Game with Idle Automation & Shapeshifting")
                }
                P(attrs = { classes("project-hero-link") }) {
                    Text("Proprietary Code - Please see bottom for current minimum viable product screenshots and video.")
                }
            }
        }

        // ── OVERVIEW ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Overview")
        }
        P {
            Text(
                "Druid Space Program is an incremental clicker game built in Godot 4.6 with C#. " +
                        "Players begin as a memory-loss-stricken Druid awakening at the base of a shattered " +
                        "World-Tree, gathering Astral Amber through clicking before shapeshifting into animal " +
                        "forms to automate resource production. The game escalates from forest-floor gathering " +
                        "to deep-space aerospace engineering, featuring a multi-tier economy, an upgrade skill " +
                        "tree, and idle progression — all driven by a decoupled, interface-based architecture " +
                        "that separates game logic from the Godot rendering layer."
            )
        }

        // ── METADATA ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Metadata")
        }
        P {
            Text("Role: Sole Developer & Designer")
            Br()
            Text("Category: Game, Incremental / Idle, Clicker")
            Br()
            Text("Repository: Proprietary Code - Please see bottom for current minimum viable product screenshots and video.")
        }

        // ── TECH STACK ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Tech Stack")
        }
        Div(attrs = { classes("tech-stack-grid") }) {
            techChip("Game Engine", "Godot 4.6 (C#)")
            techChip("Language", "C# (.NET)")
            techChip("Arithmetic", "System.Numerics.BigInteger")
            techChip("Architecture", "Singleton GameState + Interface-based Systems")
            techChip("State Management", "MasterGameState (single source of truth)")
            techChip("Tick Engine", "Frame-driven global tick with ITickable registry")
            techChip("Persistence", "JSON serialization via MasterSaveManager")
            techChip("UI Pattern", "Godot Control nodes + Controller scripts (thin-skin)")
        }

        // ── KEY FEATURES ──────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Features")
        }
        featuresList(
            "Core Clicker — tap the World-Tree to harvest Astral Amber, the primary progression currency",
            "Shapeshifting Forms — switch between Mole, Bear, Owl, and other forms, each with unique passive bonuses",
            "Idle Automation — deploy animal workers (Moles, Beavers, Spiders, etc.) that generate resources on timed ticks",
            "Three-Tier Resource Economy — from Tier 1 nature materials (Dirt, Wood) through Tier 2 refined/magic (Glowing Sap, Crystallized Stone) to Tier 3 aerospace (Rocket Fuel, Lunar Silk)",
            "Upgrade Skill Tree — spend Astral Amber to unlock forms, permanent buffs, and infrastructure habitats",
            "Offline Progress — save/load system calculates elapsed time and replays ticks on re-entry",
            "Scalable Math Engine — BigInteger arithmetic handles astronomical costs without overflow",
            "Interface-Driven Design — IWorker, IGenerator, IClickable, IUpgradable, and ITickable decouple systems from the engine"
        )

        // ── RESOURCE TIERS ────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Resource Tiers")
        }
        Div(attrs = { classes("decks-list") }) {
            deckItem("Tier 1 — Nature", "Dirt, Wood, Berries, Water, Stone, Herbs, Vines, Web")
            deckItem("Tier 2 — Refined/Magic", "Living Soil, Enchanted Lumber, Glowing Sap, Liquid Mana, Crystallized Stone")
            deckItem("Tier 3 — Aerospace", "Rocket Fuel, Lunar Silk, Meteorite Ceramic, Quantum Tendrils, Nebula Serum")
            deckItem("Currency", "Astral Amber (primary progression)")
        }

        // ── ANIMAL WORKERS ────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Animal Workers")
        }
        Div(attrs = { classes("decks-list") }) {
            deckItem("Mole", "Dirt / Zero-G Compost production")
            deckItem("Beaver", "Wood / Star Bark production")
            deckItem("Spider", "Web / Lunar Silk production")
            deckItem("Wolf", "Water / Rocket Fuel production")
            deckItem("Raccoon", "Berries / Stellar Resin production")
            deckItem("Bear", "Stone / Meteorite Ceramic production")
            deckItem("Owl", "Herbs / Nebula Serum production")
            deckItem("Parrot", "Vines / Quantum Tendrils production")
        }

        // ── THE CHALLENGE ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Challenge")
        }
        P {
            Text(
                "Incremental games present a unique engineering problem: the numbers must grow to " +
                        "astronomical scales (think 10^300+) while remaining readable, balanced, and fun " +
                        "at every stage. Simultaneously, the game needed a clean architecture that keeps " +
                        "the math engine completely isolated from the Godot rendering layer — enabling " +
                        "future UI overhauls without touching core logic."
            )
        }
        P {
            Text("1. Infinite Number Scaling — standard 64-bit integers overflow long before late-game progression. The math engine needed to handle BigInteger cost curves with exponential growth rates (1.15^level) without sacrificing tick performance.")
        }
        P {
            Text("2. Separation of Concerns — Godot's node-based architecture naturally encourages coupling logic to scenes. The challenge was enforcing a strict boundary: pure C# backend (state, tick, save) vs. thin Godot UI controllers that only read state and update visuals.")
        }
        P {
            Text("3. Idle Progression Balance — animal workers need timed ticks, population scaling, and tool upgrades that compound multiplicatively. Designing cost curves that feel rewarding at every purchase while preventing early-game stagnation required iterative tuning.")
        }

        // ── THE SOLUTION & ARCHITECTURE ───────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Solution & Architecture")
        }
        P {
            Text(
                "A strictly decoupled two-layer architecture: a pure C# backend that knows nothing " +
                        "about Godot nodes, and a thin UI layer that only reads state and drives visuals."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Interface-Driven Backend")
        }
        P {
            Text(
                "Every game entity implements a well-defined contract: IWorker produces standard " +
                        "resources, IGenerator produces Astral Amber, IClickable handles player input, " +
                        "IUpgradable manages level progression, and ITickable registers with the global " +
                        "tick engine. The MasterTickEngine maintains a registry of all active tickables " +
                        "and calls Tick(deltaTime) once per frame — no entity-specific scheduling logic " +
                        "needed. Adding a new animal species requires only implementing these interfaces."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Single Source of Truth: MasterGameState")
        }
        P {
            Text(
                "MasterGameState is a singleton that holds all game state in typed dictionaries " +
                        "mapped to ResourceType and UpgradeType enums. Resources use BigInteger for " +
                        "infinite precision; upgrade levels use int; animal data is stored in a dedicated " +
                        "AnimalData model. The dictionary-based design means adding new resource types " +
                        "requires zero changes to the state class — the enum expansion handles it. " +
                        "MasterSaveManager serializes the entire state to JSON and deserializes on load, " +
                        "including offline progress calculation via timestamp deltas."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("IncrementalMathematicsEngine")
        }
        P {
            Text(
                "Encapsulates all cost-scaling logic using configurable growth rate numerators " +
                        "and denominators (default: 115/100, i.e., 1.15x per level). The UpgradeInfo " +
                        "record defines base cost, max levels, and target modifiers (click power, production " +
                        "rate, etc.). This keeps cost curves data-driven and easily adjustable without " +
                        "modifying computation code."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Thin UI Layer")
        }
        P {
            Text(
                "Godot scenes (MainUIShell, MainContent, UpgradesContent, SettingsContent) are " +
                        "pure visual containers. Their controllers subscribe to MasterGameState events " +
                        "and update RichTextLabel displays, button states, and tab navigation. The " +
                        "ResourceAnimalRowController binds each animal worker's population and production " +
                        "labels to the central state, with event unsubscription in _ExitTree to prevent " +
                        "memory leaks. UI styling is handled entirely through Godot theme overrides — " +
                        "no inline logic."
            )
        }

        // ── PROJECT STRUCTURE ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Project Structure")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """Druid Space Program/
├── scripts/
│   ├── core/
│   │   ├── interfaces/
│   │   │   ├── IClickable.cs        # Player click input contract
│   │   │   ├── IGenerator.cs        # Astral Amber generation contract
│   │   │   ├── IUpgradable.cs       # Level progression contract
│   │   │   ├── IWorker.cs           # Standard resource production contract
│   │   │   ├── ITickable.cs         # Tick engine registration contract
│   │   │   ├── ISavable.cs          # Save system contract
│   │   │   └── IStorageProvider.cs  # Persistence abstraction
│   │   ├── models/
│   │   │   ├── GameEnums.cs         # ResourceType, UpgradeType, AnimalType
│   │   │   ├── UpgradeInfo.cs       # Cost curve configuration record
│   │   │   ├── Settings.cs          # User preferences
│   │   │   └── animals/
│   │   │       ├── BaseAnimal.cs    # Abstract IWorker + ITickable impl
│   │   │       ├── Mole.cs, Bear.cs, Owl.cs, Beaver.cs, etc.
│   │   ├── systems/
│   │   │   ├── MasterGameState.cs   # Singleton: all game state
│   │   │   ├── MasterTickEngine.cs  # Global tick dispatcher
│   │   │   ├── MasterSaveManager.cs # JSON serialization / deserialization
│   │   │   ├── IncrementalMathematicsEngine.cs  # Cost scaling math
│   │   │   └── HabitatManager.cs    # Habitat/upgrade coordination
│   │   └── ui/
│   │       ├── controllers/
│   │       │   ├── MainUIShellController.cs
│   │       │   ├── MainContentController.cs
│   │       │   ├── ResourceAnimalRowController.cs
│   │       │   ├── UpgradesContent controllers
│   │       │   └── SettingsContentController.cs
│   │       ├── resources/
│   │       │   └── UpgradeDataResource.cs  # Godot Resource data assets
│   │       └── utilities/
│   │           ├── MyButton.cs, ButtonStrobeReducer.cs
│   │           └── NumberDisplayFormatter.cs
├── scenes/
│   ├── ui/
│   │   ├── MainUIShell.tscn          # Root layout: menu + content tabs
│   │   ├── HeaderContent.tscn        # Astral Amber display header
│   │   ├── home_screen/
│   │   │   ├── MainContent.tscn      # Clicker + animal worker rows
│   │   │   └── ResourceAnimalRow.tscn
│   │   ├── upgrades_screen/
│   │   │   ├── UpgradesContent.tscn
│   │   │   └── UpgradeButton, HabitatUpgradeButton, TierContainer
│   │   └── setting_screen/
│   │       └── SettingsContent.tscn
├── data/
│   ├── animals/                      # Animal-specific data resources
│   └── game/                         # Game-wide data resources
├── addons/
│   ├── debug_menu/                   # Dev cheat menu (offline progress, etc.)
│   └── rider-plugin/
├── main.tscn                         # Entry point scene
├── project.godot                     # Godot project config
└── Druid Space Program.sln           # C# solution file"""
            )
        }

        // ── KEY TAKEAWAYS ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Takeaways & Lessons Learned")
        }
        featuresList(
            "Interface-first design — defining contracts (IWorker, IGenerator, ITickable) before implementation kept the codebase modular and made adding new animal species trivial",
            "BigInteger for incremental games — standard integer types fail catastrophically at late-game scales; BigInteger with exponential cost curves is essential for this genre",
            "Pure backend separation — keeping the C# core completely free of Godot node references means the math engine can be unit-tested independently and the UI can be completely re-skinned without touching logic",
            "Dictionary-based state — mapping resources to enum keys instead of individual properties makes the state class inherently extensible; adding a Tier 4 resource requires zero state class changes",
            "Tick engine pattern — a centralized dispatcher that iterates registered ITickable entities is simpler and more performant than per-entity timers for incremental games"
        )

        // ── ROADMAP ───────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Roadmap")
        }
        featuresList(
            "Prestige / Reset system — wipe progress for permanent multipliers based on Tier 1/2/3 achievement",
            "Full asset pipeline — replace placeholder UI with hand-drawn sprites, habitat visuals, and animated click feedback",
            "Shapeshifting active mechanics — Bear form for boosted clicking, Owl form for offline speed-up, with cooldowns and mana costs",
            "Launchpad endgame — a massive final structure consuming millions of resources as the ultimate win-condition",
            "Multi-language support — internationalization for the UI text",
            "Analytics & balancing dashboard — track economy health metrics during playtesting"
        )

        // ── SCREENSHOTS ───────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Screenshots")
        }
        Div(attrs = { classes("project-image-set") }) {
            ZoomableImage(
                imageUrl = "images/druidSpaceProgram/DruidSpaceProgram-Home.png",
                imageAlt = "Druid Space Program — Main Screen with Clicker and Animal Workers"
            )
            ZoomableImage(
                imageUrl = "images/druidSpaceProgram/DruidSpaceProgram-Upgrades.png",
                imageAlt = "Druid Space Program — Upgrades Screen"
            )
            ZoomableImage(
                imageUrl = "images/druidSpaceProgram/DruidSpaceProgram-Settings.png",
                imageAlt = "Druid Space Program — Settings Screen"
            )
        }

        // ── Footer ────────────────────────────────────────────────────
        Div(attrs = { classes("project-footer") }) {
            P { Text("Created by Tabitha Tallent") }
            P { Text("WIP — In Development") }
        }
    }
}

// ── HELPER: Tech Stack Chip ──────────────────────────────────────────

@Composable
private fun techChip(label: String, value: String) {
    Div(attrs = { classes("tech-chip") }) {
        Span(attrs = { classes("tech-chip-label") }) {
            Text(label)
        }
        Div(attrs = { classes("tech-chip-value") }) {
            Text(value)
        }
    }
}

// ── HELPER: Feature Bullet ───────────────────────────────────────────

@Composable
private fun featuresList(vararg items: String) {
    items.forEach { item ->
        P(attrs = { classes("feature-item") }) {
            Span(attrs = { classes("feature-bullet") }) {
                Text("• ")
            }
            Text(item)
        }
    }
}

// ── HELPER: Deck/Row Item ────────────────────────────────────────────

@Composable
private fun deckItem(name: String, count: String) {
    Div(attrs = { classes("resource-item") }) {
        Span(attrs = { classes("resource-number") }) {
            Text(count)
        }
        Span(attrs = { classes("resource-name") }) {
            Text(name)
        }
    }
}

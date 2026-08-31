# TabbyCat444.github.io

A personal portfolio website built with **Kotlin Multiplatform** and **Jetpack Compose for Web**, showcasing a collection of creative and technical projects.

![Kotlin](https://img.shields.io/badge/Kotlin-2.0.0-%237F52FF)
![Compose for Web](https://img.shields.io/badge/Compose%20for%20Web-1.6.11-%237F52FF)
![JavaScript](https://img.shields.io/badge/Target-JavaScript-F7DF1E)

## Overview

This is a single-page portfolio application that presents a curated collection of projects spanning game development, creative writing, utility tools, and more. It features a clean, responsive design with dark/light theme toggling, interactive project cards, and modal detail views.

## Features

- **Jetpack Compose for Web** — Declarative UI built entirely in Kotlin
- **Dark/Light Theme** — Toggle between themes with a single click
- **Project Showcase** — Browse projects through interactive cards that open into detailed modal views
- **Responsive Layout** — Hero section, project grid, contact section, and footer
- **Zero JavaScript boilerplate** — Pure Kotlin, no imperative DOM manipulation

## Tech Stack

| Technology | Purpose |
|---|---|
| [Kotlin 2.0.0](https://kotlinlang.org/) | Programming language |
| [Compose for Web 1.6.11](https://www.jetbrains.com/lp/compose/) | UI framework |
| [Gradle](https://gradle.org/) (Kotlin DSL) | Build system |
| [KotlinX Coroutines](https://github.com/Kotlin/kotlinx.coroutines) | Async handling |
| [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) | JS target compilation |

## Project Structure

```text
src/jsMain/kotlin/com/tabithatallent/portfolio/
├── Main.kt                     # Application entry point
├── components/
│   ├── Badge.kt                # Reusable tag/badge component
│   ├── ContactSection.kt       # Contact information section
│   ├── DemoEmbed.kt            # Embedded demo viewer
│   ├── Footer.kt               # Site footer
│   ├── Header.kt               # Navigation header with theme toggle
│   ├── HeroSection.kt          # Landing hero area
│   ├── ImageZoom.kt            # Image zoom functionality
│   ├── ProjectCard.kt          # Project thumbnail card
│   └── ProjectModal.kt         # Detailed project modal overlay
├── data/
│   ├── Project.kt              # Project data model
│   └── ProjectsData.kt         # Project catalog data
├── nav/
│   └── Screen.kt               # Navigation routing & view registry
├── style/
│   └── AppClasses.kt           # Shared CSS class definitions
└── views/
    ├── HomeView.kt             # Main home page view
    └── projects/
        ├── CornerSliceBakeryView.kt
        ├── DruidSpaceProgramView.kt
        ├── JapCrdView.kt
        ├── KidnappedByTheFaeView.kt
        └── TaxCalculatorView.kt
```


## Showcased Projects

| Project | Description |
|---|---|
| **JapCrd** | A card-based game project |
| **The Corner Slice Bakery** | A bakery-themed project |
| **Kidnapped by the Fae** | A creative writing / interactive fiction project |
| **Tax Calculator** | A utility tool for tax calculations |
| **Druid Space Program** | A space-themed druid project |

## Getting Started

### Prerequisites

- **JDK 17+** (recommended)
- **Node.js** (for the JS browser target)

### Building

```bash
# Clone the repository
git clone https://github.com/TabbyCat444/tabitha-tallent-portfolio.git
cd tabitha-tallent-portfolio

# Build the project (compiles to JavaScript)
./gradlew assemble

# Run the dev server
./gradlew jsBrowserRun
```

## Output

The compiled JavaScript bundle is emitted as `tabitha-tallent-portfolio.js` and can be served via any static file server.

## Build Commands

| Command | Description |
| :--- | :--- |
| `./gradlew assemble` | Build the JS bundle |
| `./gradlew jsBrowserRun` | Run with hot-reload in the browser |
| `./gradlew jsBrowserProductionWebpack` | Build for production |


## License & Usage

© 2026 Tabitha Tallent. All rights reserved.

This repository contains the source code for my personal portfolio.
The code is publicly viewable for code review and demonstration purposes only.
Replication, redistribution, or commercial use of any part of this design
or content is strictly prohibited.
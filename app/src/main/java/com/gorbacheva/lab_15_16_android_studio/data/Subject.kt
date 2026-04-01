package com.gorbacheva.lab_15_16_android_studio.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String,

)
val sampleSubject = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Инструментальные средства разработки программного обеспечения",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Изучение современных инструментов и сред разработки ПО: IDE (IntelliJ IDEA, Visual Studio Code), системы контроля версий (Git, GitHub)"
    ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "4",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        credits = 91,
        currentGrade = "Хорошо",
        description = "Изучение процесса разработки отдельных программных модулей как части крупного проекта. Освоение принципов модульности, инкапсуляции и взаимодействия компонентов."
    )
)
package com.gorbacheva.lab_15_16_android_studio.ui_model

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gorbacheva.lab_15_16_android_studio.data.ScheduleItem
import com.gorbacheva.lab_15_16_android_studio.data.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduleScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Расписание") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Назад"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item { DayScheduleCard("Понедельник", mondaySchedule) }
            item { DayScheduleCard("Вторник", tuesdaySchedule) }
            item { DayScheduleCard("Среда", wednesdaySchedule) }
            item { DayScheduleCard("Четверг", thursdaySchedule) }
            item { DayScheduleCard("Пятница", fridaySchedule) }
        }
    }
}

@Composable
fun DayScheduleCard(day: String, scheduleItems: List<ScheduleItem>) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = day,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))

            if (scheduleItems.isEmpty()) {
                Text("Занятий нет")
            } else {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    scheduleItems.forEach { scheduleItem ->
                        Text(
                            text = "${scheduleItem.subjectName} | ${scheduleItem.time}",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
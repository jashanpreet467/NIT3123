package com.example.architecture_application.models

data class DashboardResponse(
    val entities: List<EntityDetails>,
    val entityTotal: Int
)

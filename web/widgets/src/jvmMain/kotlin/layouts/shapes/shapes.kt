package jetbrains.compose.common.shapes

import org.jetbrains.compose.common.ui.ExperimentalComposeWebWidgetsApi
import androidx.compose.ui.graphics.Shape as JShape
import androidx.compose.foundation.shape.CircleShape as JCircleShape

@ExperimentalComposeWebWidgetsApi
val Shape.implementation: JShape
    get() = when (this) {
        CircleShape -> JCircleShape
        else -> throw ClassCastException("Currently supporting only circle shape")
    }

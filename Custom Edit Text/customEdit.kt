package com.example.unit4

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.util.TypedValue
import androidx.appcompat.widget.AppCompatEditText

class customEdit @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle
) : AppCompatEditText(context, attrs, defStyleAttr) {

    private var borderColor: Int = 0
    private var borderWidth: Float = 0f
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.customEditText)

        borderColor = typedArray.getColor(
            R.styleable.customEditText_borderColor,
            resources.getColor(android.R.color.holo_purple,null)
        )

        borderWidth = typedArray.getDimension(
            R.styleable.customEditText_borderWidth,
            TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2f, resources.displayMetrics)
        )
        typedArray.recycle()

        paint.color = borderColor
        paint.strokeWidth = borderWidth
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw border only if width is greater than zero
        if (borderWidth > 0) {
            paint.style = Paint.Style.STROKE
            val halfBorder = borderWidth / 2

            // Draw rectangle border around the EditText
            canvas?.drawRect(
                halfBorder,
                halfBorder,
                width.toFloat() - halfBorder,
                height.toFloat() - halfBorder,
                paint
            )
        }
    }
}

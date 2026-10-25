Function MP_UpdatePing%()
    If (T8X2046020\Field9 < GUESSEDupdateitems_2()) Then
        T8X2046020\Field20[$00] = MP_GetPing(GUESSEDinitinitnewgame_8(), GUESSEDgetglobal_19(), $00)
        T8X2046020\Field20[$01] = MP_GetPing(GUESSEDinitinitnewgame_8(), GUESSEDgetglobal_19(), $01)
        T8X2046020\Field9 = (GUESSEDupdateitems_2() + $32)
    EndIf
    Return $00
End Function

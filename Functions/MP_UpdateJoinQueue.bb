Function MP_UpdateJoinQueue%(arg0%, arg1%, arg2%)
    Local local0%
    If (((arg2 = $00) And mainmenuopen) <> 0) Then
        GUESSEDsetglobal_2()
        local0 = GUESSEDinitdotted(arg0, arg1, GUESSEDgetglobal_14())
        If (local0 <> $00) Then
            MP_Reset()
            GUESSEDsetglobal_8()
        EndIf
        GUESSEDupdateobjects_10($01)
    ElseIf (mainmenuopen = $00) Then
        renderloading(99.5, format(getlocalstring("mpmenu", "queue"), (Str arg2), "%s"), $00, 0.025)
    EndIf
    Return $00
End Function

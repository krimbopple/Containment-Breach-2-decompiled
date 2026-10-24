Function X8F80Z2886%(arg0%, arg1%, arg2%)
    Local local0%
    If (entityclass(arg0) = "Pivot") Then
        Return $00
    EndIf
    local0 = getentitybrush(arg0)
    TZXZZ288XZ(local0, arg1, arg2)
    paintentity(arg0, local0)
    freebrush(local0)
    local0 = $00
    Return $00
End Function

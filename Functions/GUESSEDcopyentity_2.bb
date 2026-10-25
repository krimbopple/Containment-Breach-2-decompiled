Function GUESSEDcopyentity_2%(arg0%, arg1%)
    Local local0%
    local0 = copyentity(arg0, arg1)
    If (animlength(arg0) < $00) Then
        If (getinstance(arg0) <> $00) Then
            arg0 = getinstance(arg0)
        EndIf
        entityinstance(local0, arg0)
        GUESSEDcopyentity(local0, arg0)
        showentity(arg0)
    EndIf
    Return local0
    Return $00
End Function

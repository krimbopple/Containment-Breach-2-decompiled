Function GUESSEDcheckvalue_24$(arg0$, arg1%)
    Local local0$
    local0 = mid(arg0, arg1, $01)
    If (local0 = chr($03)) Then
        Return ""
    EndIf
    Return local0
    Return ""
End Function

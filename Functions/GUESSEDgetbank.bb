Function GUESSEDgetbank%()
    If (((GUESSEDgetglobal_3() = $00) Lor (banksize(T484F2XDF\Field1) = $00)) <> 0) Then
        Return $00
    EndIf
    Return T484F2XDF\Field1
    Return $00
End Function

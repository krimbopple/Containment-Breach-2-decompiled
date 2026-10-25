Function GUESSEDcheckvalue_2%(arg0.TX2BF6X0FF4)
    Local local0.rooms
    local0 = XXDB6F64F2[arg0\Field3]
    If (local0 = Null) Then
        Return $00
    EndIf
    Return (((local0\Field22\Field21 = $4C) Lor (local0\Field22\Field21 = $4E)) Lor (local0\Field22\Field21 = $72))
    Return $00
End Function

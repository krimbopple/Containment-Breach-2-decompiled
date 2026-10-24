Function T2X820D0FD$(arg0.T484FFBZX)
    Local local0%
    Local local1$
    If ((arg0\Field0 + $04) > arg0\Field2) Then
        Return ""
    EndIf
    local0 = (Int min((Float peekint(arg0\Field3, arg0\Field0)), 32768.0))
    arg0\Field0 = (arg0\Field0 + $04)
    If (((local0 < $01) Lor ((arg0\Field0 + local0) > arg0\Field2)) <> 0) Then
        Return ""
    EndIf
    local1 = peekstring(arg0\Field3, (arg0\Field0 - $04))
    arg0\Field0 = (arg0\Field0 + local0)
    Return local1
    Return ""
End Function

Function GUESSEDsetpeek_4#(arg0.T484FFBZX)
    If ((arg0\Field0 + $04) > arg0\Field2) Then
        Return 0.0
    EndIf
    arg0\Field0 = (arg0\Field0 + $04)
    Return peekfloat(arg0\Field3, (arg0\Field0 - $04))
    Return 0.0
End Function

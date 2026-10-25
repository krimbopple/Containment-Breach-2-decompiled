Function GUESSEDsetpeek%(arg0.T484FFBZX)
    If ((arg0\Field0 + $04) > arg0\Field2) Then
        Return $00
    EndIf
    arg0\Field0 = (arg0\Field0 + $04)
    Return peekint(arg0\Field3, (arg0\Field0 - $04))
    Return $00
End Function

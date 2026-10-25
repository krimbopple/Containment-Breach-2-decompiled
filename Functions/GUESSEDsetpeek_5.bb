Function GUESSEDsetpeek_5%(arg0.T484FFBZX)
    If ((arg0\Field0 + $02) > arg0\Field2) Then
        Return $00
    EndIf
    arg0\Field0 = (arg0\Field0 + $02)
    Return peekshort(arg0\Field3, (arg0\Field0 - $02))
    Return $00
End Function

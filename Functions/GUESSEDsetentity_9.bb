Function GUESSEDsetentity_9%(arg0.TX2BF6X0FF4)
    If (arg0\Field46 = Null) Then
        Return $00
    EndIf
    _Deque_PopBack(arg0\Field46\Field30)
    _Deque_PushFront(arg0\Field46\Field30, entityx(arg0\Field31, $00, 1.0), entityy(arg0\Field31, $00, 1.0), entityz(arg0\Field31, $00, 1.0))
    Return $00
End Function

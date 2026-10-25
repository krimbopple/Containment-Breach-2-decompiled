Function GUESSEDrenderrendercursor%(arg0%, arg1%)
    GUESSEDcallclamp_2($FFFFFFFF)
    GUESSEDdrawentity()
    GUESSEDsetcolor_4(arg1)
    GUESSEDrendersplit(arg0, arg1)
    GUESSEDsetcolor_3()
    If (TX6X48DXXDX <> 0) Then
        rendercursor()
    EndIf
    Return $00
End Function

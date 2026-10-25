Function GUESSEDdeleteremoveitem_2%(arg0.items, arg1.items, arg2%)
    arg0\Field18 = $00
    If ((((GUESSEDupdatexdb() <> $00) And (GUESSEDupdateanimatenpc() = $00)) And arg2) <> 0) Then
        GUESSEDsenditempair(arg0, arg1)
        Return $01
    EndIf
    GUESSEDdeleteerase($00, arg0\Field27, arg0, $FFFFFFFF)
    Return $00
    Return $00
End Function

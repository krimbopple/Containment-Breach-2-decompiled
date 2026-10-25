Function GUESSEDdeleteclose%(arg0.TX2BF6X0FF4)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        _Steam_CloseP2PSession(arg0\Field21\Field3)
    EndIf
    If (arg0\Field21\Field1 <> $00) Then
        freeimage(arg0\Field21\Field1)
    EndIf
    Delete arg0\Field21
    Return $00
End Function

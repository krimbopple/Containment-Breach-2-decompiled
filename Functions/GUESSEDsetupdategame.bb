Function GUESSEDsetupdategame%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (GUESSEDupdateanimatenpc() <> 0) Then
        Return $00
    EndIf
    If (((TXDFXDZXXDD\Field10 <> Null) And (0.0 >= TXDFXDZXXDD\Field10\Field9)) <> 0) Then
        TXDFXDZXXDD\Field10 = Null
    EndIf
    If (((TXDFXDZXXDD\Field13 <> Null) And (0.0 >= TXDFXDZXXDD\Field13\Field10)) <> 0) Then
        TXDFXDZXXDD\Field13 = Null
    EndIf
    If (playerroom <> Null) Then
        GUESSEDupdateobjects_9(playerroom)
        For local3 = $00 To $03 Step $01
            If (playerroom\Field29[local3] <> Null) Then
                GUESSEDupdateobjects_9(playerroom\Field29[local3])
            EndIf
        Next
    EndIf
    Return $00
End Function

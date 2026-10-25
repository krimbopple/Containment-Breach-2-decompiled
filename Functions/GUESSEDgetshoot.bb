Function GUESSEDgetshoot#(arg0.npcs)
    If (arg0\Field5 <> 0) Then
        Return XZ0260X8X2\Field11
    EndIf
    If ((GUESSEDupdateanimatenpc() And (arg0\Field28 <> Null)) <> 0) Then
        Return arg0\Field28\Field46\Field9
    EndIf
    Return 0.0
End Function

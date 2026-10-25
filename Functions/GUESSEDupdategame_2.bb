Function GUESSEDupdategame_2%()
    Local local0.TX2BF6X0FF4
    If (GUESSEDupdateanimatenpc() = $00) Then
        Return $00
    EndIf
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            mp_UpdateplayerRoom(local0)
        EndIf
    Next
    Return $00
End Function

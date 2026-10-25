Function GUESSEDplayentity%(arg0.T24B4ZF6F6)
    Local local0%
    If (arg0 = Null) Then
        Return $00
    EndIf
    positionentity(arg0\Field4, -99990.0, -99990.0, -99990.0, $00)
    positionentity(arg0\Field9, -99990.0, -99990.0, -99990.0, $00)
    entityalpha(arg0\Field9, 0.0)
    captureentity(arg0\Field4)
    captureentity(arg0\Field9)
    hideentity(arg0\Field9)
    DZ64X028\Field63 = Null
    If (arg0\Field3\Field9 <> 0) Then
        If (DZ64X028\Field61 <> Null) Then
            If (DZ64X028\Field61\Field6\Field25 <> $00) Then
                DZ64X028\Field61\Field6\Field3 = $00
                DZ64X028\Field61\Field6\Field4 = $00
                freeimage(DZ64X028\Field61\Field6\Field25)
                DZ64X028\Field61\Field6\Field25 = $00
            EndIf
            If (DZ64X028\Field61\Field6\Field15 <> $00) Then
                DZ64X028\Field61\Field6\Field17 = $00
                DZ64X028\Field61\Field6\Field18 = $00
                freeimage(DZ64X028\Field61\Field6\Field15)
                DZ64X028\Field61\Field6\Field15 = $00
            EndIf
        EndIf
        For local0 = $00 To $06 Step $01
            If (ChannelPlaying(radiochn[local0]) <> 0) Then
                StopChannel(radiochn[local0])
                radiochn[local0] = $00
            EndIf
        Next
    EndIf
    Return $00
End Function

Function updatenpcice%(arg0.npcs)
    Local local0#
    If (0.0 < arg0\Field34) Then
        If (2100.0 > arg0\Field34) Then
            arg0\Field34 = (arg0\Field34 + fps\Field3[$00])
            local0 = max(100.0, (255.0 - (arg0\Field34 * 0.1)))
            entitycolor(arg0\Field98, 255.0, local0, local0)
            If (arg0\Field77 <> $06) Then
                If (2093.0 < arg0\Field34) Then
                    entityshininess(arg0\Field98, 1.0, 0.5)
                    playsoundex(loadtempsound("SFX\SCP\009\IceCracking.ogg"), camera, arg0\Field82, 5.0, 0.4, $00, $00)
                    giveachievement("frostbite", $01)
                    setnpcframe(arg0, arg0\Field103, $01)
                    If (ChannelPlaying(arg0\Field63) <> 0) Then
                        StopChannel(arg0\Field63)
                        arg0\Field63 = $00
                    EndIf
                    If (arg0\Field55 <> $00) Then
                        freesound_strict(arg0\Field55)
                        arg0\Field55 = $00
                    EndIf
                    If (ChannelPlaying(arg0\Field6) <> 0) Then
                        StopChannel(arg0\Field6)
                        arg0\Field6 = $00
                    EndIf
                    If (arg0\Field67 <> $00) Then
                        freesound_strict(arg0\Field67)
                        arg0\Field67 = $00
                    EndIf
                    arg0\Field66 = 66.0
                    arg0\Field1 = $01
                    arg0\Field34 = 2100.0
                EndIf
            EndIf
        EndIf
        If (arg0\Field77 <> $06) Then
            arg0\Field32 = max((arg0\Field32 - (fps\Field3[$00] * 0.000005)), 0.0)
        EndIf
    EndIf
    Return $00
End Function

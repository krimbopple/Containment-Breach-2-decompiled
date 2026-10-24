Function updatenvg%()
    Local local0%
    Local local1%
    T8660BZ460\Field5 = $00
    If ((((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) And (T8660BZ460\Field8 <> $03)) <> 0) Then
        For local1 = $00 To (maxitemamount - $01) Step $01
            If (TX60DB8XBBZ(local1) <> Null) Then
                If ((((((T8660BZ460\Field8 = $01) And (TX60DB8XBBZ(local1)\Field6\Field9 = $40)) Lor ((T8660BZ460\Field8 = $02) And (TX60DB8XBBZ(local1)\Field6\Field9 = $41))) Lor ((T8660BZ460\Field11 = $01) And (TX60DB8XBBZ(local1)\Field6\Field9 = $43))) Lor ((T8660BZ460\Field11 = $02) And (TX60DB8XBBZ(local1)\Field6\Field9 = $44))) <> 0) Then
                    If (T8660BZ460\Field8 > $00) Then
                        TX60DB8XBBZ(local1)\Field15 = max(0.0, (TX60DB8XBBZ(local1)\Field15 - (fps\Field3[$00] * (0.04 / (Float T8660BZ460\Field8)))))
                    EndIf
                    If (T8660BZ460\Field11 > $00) Then
                        TX60DB8XBBZ(local1)\Field15 = max(0.0, (TX60DB8XBBZ(local1)\Field15 - (fps\Field3[$00] * (0.08 / (Float T8660BZ460\Field11)))))
                    EndIf
                    T8660BZ460\Field2 = (Int TX60DB8XBBZ(local1)\Field15)
                    Exit
                EndIf
            EndIf
        Next
        If (T8660BZ460\Field2 = $00) Then
            createhintmsg(getlocalstring("msg", "bat.combine"), 1.0, $01)
            If (T8660BZ460\Field11 > $00) Then
                createmsg(getlocalstring("msg", "battery.died"), 6.0)
            Else
                createmsg(getlocalstring("msg", "battery.died.nvg"), 6.0)
            EndIf
            T8660BZ460\Field5 = $01
        EndIf
    Else
        T8660BZ460\Field2 = $00
    EndIf
    If (T8660BZ460\Field2 > $00) Then
        If (T8660BZ460\Field11 = $02) Then
            If (n_i\Field3 <> Null) Then
                n_i\Field3\Field100 = entityx(n_i\Field3\Field98, $01, 1.0)
                n_i\Field3\Field14 = (entityy(n_i\Field3\Field98, $01, 1.0) + 0.5)
                n_i\Field3\Field97 = entityz(n_i\Field3\Field98, $01, 1.0)
            EndIf
        ElseIf (T8660BZ460\Field8 = $02) Then
            If (0.0 >= T8660BZ460\Field1) Then
                T8660BZ460\Field5 = $01
                If (-10.0 >= T8660BZ460\Field1) Then
                    T8660BZ460\Field1 = 450.0
                EndIf
            EndIf
            T8660BZ460\Field1 = (T8660BZ460\Field1 - fps\Field3[$00])
        EndIf
        If (T8660BZ460\Field2 < $A0) Then
            If (70.0 <= batmsgtimer) Then
                If (ChannelPlaying(lowbatterychn[$01]) = $00) Then
                    XZ0260X8X2\Field68 = max(4.0, XZ0260X8X2\Field68)
                    lowbatterychn[$01] = playsound_strict(snd_i\Field4[$01], $00, $00)
                EndIf
            EndIf
        EndIf
    EndIf
    Return $00
End Function

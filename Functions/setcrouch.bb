Function setcrouch%(arg0%)
    Local local0%
    If (arg0 <> XZ0260X8X2\Field25) Then
        If (arg0 = $00) Then
            If (linepick(entityx(XZ0260X8X2\Field74, $00, 1.0), entityy(XZ0260X8X2\Field74, $00, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), 0.0, 0.57, 0.0, 0.12) <> $00) Then
                Return $00
            EndIf
        EndIf
        playsound_strict(snd_i\Field15, $00, $00)
        If (arg0 = $00) Then
            If (0.0 < XZ0260X8X2\Field56) Then
                XZ0260X8X2\Field56 = (XZ0260X8X2\Field56 - rnd(8.0, 16.0))
                If (10.0 > XZ0260X8X2\Field56) Then
                    If (ChannelPlaying(breathchn) = $00) Then
                        local0 = $00
                        If ((((T8660BZ460\Field3 > $00) Lor (i_1499\Field8 > $00)) Lor (T8660BZ460\Field10 > $00)) <> 0) Then
                            local0 = $01
                        EndIf
                        breathchn = playsound_strict(TFB8222B2X(local0, $00), $01, $00)
                    EndIf
                EndIf
            EndIf
            entityradius(XZ0260X8X2\Field74, 0.15, 0.5)
            entitycenter(XZ0260X8X2\Field74, 0.0, 0.2, 0.0)
        Else
            entityradius(XZ0260X8X2\Field74, 0.15, 0.33)
            entitycenter(XZ0260X8X2\Field74, 0.0, 0.03, 0.0)
        EndIf
        XZ0260X8X2\Field25 = arg0
        Return $01
    EndIf
    Return $00
End Function

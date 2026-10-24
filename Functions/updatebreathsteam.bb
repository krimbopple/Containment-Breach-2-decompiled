Function updatebreathsteam%()
    Local local0%
    If (((T8660BZ460\Field10 <> $00) Lor (T8660BZ460\Field3 <> $00)) <> 0) Then
        local0 = $00
        Return $00
    EndIf
    local0 = (Int (fps\Field3[$00] + (Float local0)))
    If ((Float local0) > ((rnd(2.8, 3.2) - ((Float ChannelPlaying(breathchn)) * 1.5)) * 70.0)) Then
        setemitter(Null, entityx(camera, $01, 1.0), (entityy(camera, $01, 1.0) - 0.05), entityz(camera, $01, 1.0), $1C)
        local0 = $00
    EndIf
    Return $00
End Function

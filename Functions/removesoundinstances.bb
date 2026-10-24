Function removesoundinstances%()
    Local local0%
    For local0 = $00 To $0D Step $01
        If (local0 < $02) Then
            YXZ2BB66B($00, local0) = $00
            snd_i\Field4[local0] = $00
            snd_i\Field31[local0] = $00
            snd_i\Field29[local0] = $00
            snd_i\Field0[local0] = $00
            snd_i\Field3[local0] = $00
            snd_i\Field21[local0] = $00
            snd_i\Field37[local0] = $00
        EndIf
        If (local0 < $03) Then
            TZ2064ZFDB($00, local0) = $00
            TX6X4XZX2F($00, local0) = $00
            TZ2064ZFDB($01, local0) = $00
            TX6X4XZX2F($01, local0) = $00
            TZ2064ZFDB($02, local0) = $00
            TX6X4XZX2F($02, local0) = $00
            TZ2064ZFDB($03, local0) = $00
            TX6X4XZX2F($03, local0) = $00
            TZ2064ZFDB($04, local0) = $00
            TZ2064ZFDB($05, local0) = $00
            TZ2064ZFDB($06, local0) = $00
            snd_i\Field47[local0] = $00
            snd_i\Field27[local0] = $00
            snd_i\Field35[local0] = $00
            D8BF2B828($00, local0) = $00
            D8BF2B828($01, local0) = $00
            snd_i\Field5[local0] = $00
            snd_i\Field28[local0] = $00
        EndIf
        If (local0 < $04) Then
            snd_i\Field1[local0] = $00
            snd_i\Field46[local0] = $00
            snd_i\Field44[local0] = $00
            snd_i\Field36[local0] = $00
            snd_i\Field48[local0] = $00
        EndIf
        If (local0 < $05) Then
            TFB8222B2X($00, local0) = $00
            TFB8222B2X($01, local0) = $00
        EndIf
        If (local0 < $06) Then
            ambientsfxamount[local0] = $00
            snd_i\Field24[local0] = $00
        EndIf
        If (local0 < $07) Then
            snd_i\Field2[local0] = $00
        EndIf
        If (local0 < $08) Then
            TXDBZF46ZXF($00, $00, local0) = $00
            TXDBZF46ZXF($00, $01, local0) = $00
            TXDBZF46ZXF($01, $00, local0) = $00
            TXDBZF46ZXF($01, $01, local0) = $00
            If (local0 < $03) Then
                TXDBZF46ZXF($02, $00, local0) = $00
                TXDBZF46ZXF($03, $00, local0) = $00
                TXDBZF46ZXF($04, $00, local0) = $00
            EndIf
            If (local0 < $02) Then
                TXDBZF46ZXF($05, $00, local0) = $00
            EndIf
            snd_i\Field58[local0] = $00
        EndIf
        If (local0 < $09) Then
            YXZ2BB66B($01, local0) = $00
        EndIf
        If (local0 < $0B) Then
            npcsound[local0] = $00
        EndIf
        If (local0 < $0C) Then
            roomambience[local0] = $00
        EndIf
        If (local0 < $0D) Then
            snd_i\Field51[local0] = $00
        EndIf
        If (local0 < $0E) Then
            snd_i\Field40[local0] = $00
        EndIf
        snd_i\Field50[local0] = $00
    Next
    snd_i\Field52 = $00
    snd_i\Field26 = $00
    snd_i\Field38 = $00
    snd_i\Field53 = $00
    snd_i\Field12 = $00
    snd_i\Field7 = $00
    snd_i\Field30 = $00
    snd_i\Field43 = $00
    snd_i\Field54 = $00
    snd_i\Field56 = $00
    snd_i\Field32 = $00
    snd_i\Field34 = $00
    snd_i\Field6 = $00
    snd_i\Field14 = $00
    snd_i\Field18 = $00
    snd_i\Field59 = $00
    snd_i\Field11 = $00
    snd_i\Field39 = $00
    snd_i\Field20 = $00
    snd_i\Field57 = $00
    snd_i\Field45 = $00
    snd_i\Field22 = $00
    snd_i\Field25 = $00
    snd_i\Field55 = $00
    snd_i\Field49 = $00
    snd_i\Field41 = $00
    snd_i\Field15 = $00
    snd_i\Field16 = $00
    snd_i\Field60 = $00
    snd_i\Field13 = $00
    snd_i\Field8 = $00
    snd_i\Field19 = $00
    snd_i\Field10 = $00
    snd_i\Field9 = $00
    snd_i\Field23 = $00
    snd_i\Field17 = $00
    Delete snd_i
    snd_i = Null
    Return $00
End Function

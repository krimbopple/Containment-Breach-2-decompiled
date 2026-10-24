Function T4BF4FFBD%()
    Local local0%
    T200Z6BDDZ[$00] = "SFX\Character\BulletHit2.ogg"
    T200Z6BDDZ[$01] = "SFX\Character\BulletHit3.ogg"
    T200Z6BDDZ[$02] = "SFX\Character\BulletHitMetall.ogg"
    T200Z6BDDZ[$03] = "SFX\Character\BulletHitGlass.ogg"
    T200Z6BDDZ[$04] = "SFX\Character\BulletHitCement.ogg"
    For local0 = $00 To $04 Step $01
        E8FD84BZX(T200Z6BDDZ[local0])
    Next
    Return $00
End Function

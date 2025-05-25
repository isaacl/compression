# Chess clock and move compression algorithms for lichess.org

## Blog posts

- [A better game clock history](https://lichess.org/blog/WOEVrjAAALNI-fWS/a-better-game-clock-history)
- [Developer update: 275% improved game compression](https://lichess.org/blog/Wqa7GiAAAOIpBLoY/developer-update-275-improved-game-compression)

## Benchmarks

```bash
sbt 'benchmarks/jmh:run -i 5 -wi 3 -f1 -t1 org.lichess.compression.benchmark.*'
```

## License

This library is licensed under the GNU Affero General Public License 3 or
any later version at your option. See LICENSE for the full license text.
